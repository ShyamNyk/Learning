var express = require('express');
var router = express.Router();
var passport = require('passport');
var config = require('../config.js');

router.get(
	'/',
	function(req, res) {
		req.logout();
		res.redirect(config.samlIdpLogoutUrl);
	}
);

module.exports = router;
