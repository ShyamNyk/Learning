var express = require('express');
var path = require('path');
var favicon = require('serve-favicon');
var logger = require('morgan');
var cookieParser = require('cookie-parser');
var bodyParser = require('body-parser');
var session = require('express-session');
var passport = require('passport');
var SamlStrategy = require('passport-saml').Strategy

var config = require('./config.js');
var routes = require('./routes/index');
var login = require('./routes/login');
var logout = require('./routes/logout');
var consume = require('./routes/consume');

var app = express();

// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'jade');

// uncomment after placing your favicon in /public
//app.use(favicon(__dirname + '/public/favicon.ico'));
app.use(logger('dev'));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));
app.use(session({
	secret: "whatever",
	resave: true,
	saveUninitialized: true
}));

// Being Passport SAML specific code
app.use(passport.initialize());
app.use(passport.session());
// End Passport SAML specific code

app.use('/', routes);
app.use('/login', login);
app.use('/logout', logout);
app.use('/consume', consume);

// catch 404 and forward to error handler
app.use(function(req, res, next) {
  var err = new Error('Not Found');
  err.status = 404;
  next(err);
});

// error handlers

// development error handler
// will print stacktrace
if (app.get('env') === 'development') {
  app.use(function(err, req, res, next) {
    res.status(err.status || 500);
    res.render('error', {
      message: err.message,
      error: err
    });
  });
}

// production error handler
// no stacktraces leaked to user
app.use(function(err, req, res, next) {
  res.status(err.status || 500);
  res.render('error', {
    message: err.message,
    error: {}
  });
});

// Begin Passport SAML specific code
passport.serializeUser(function(user, done) {
	done(null, user);
});

passport.deserializeUser(function(user, done) {
	done(null, user);
});

passport.use(new SamlStrategy(config.saml, function(profile, done) {
	return done(null, profile);
}));
// End Passport SAML specific code

module.exports = app;
