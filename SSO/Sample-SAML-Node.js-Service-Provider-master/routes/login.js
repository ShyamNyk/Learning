var express = require('express');
var router = express.Router();
var passport = require('passport');

router.get(
	'/',
	passport.authenticate('saml', {failureRedirect: '/', failureFlash: true}),
	function(req, res) {
		res.redirect('/');
	}
);

module.exports = router;
