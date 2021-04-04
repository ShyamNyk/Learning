var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
	res.render('index', {
		user: req.isAuthenticated()? req.user : null,
		title: 'Sample SAML Node.js Application'
	});
});

module.exports = router;
