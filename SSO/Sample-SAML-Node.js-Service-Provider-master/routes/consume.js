var express = require('express');
var router = express.Router();
var passport = require('passport');
var config = require('../config');

router.post(
	'/',
	passport.authenticate('saml', {failureRedirect: '/', failureFlash: true}),
	function(req, res) {
		res.redirect(config.appRootUrl);
	}
);

module.exports = router;
