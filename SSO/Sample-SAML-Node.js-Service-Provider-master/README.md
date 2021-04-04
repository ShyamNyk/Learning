# Sample SAML Node.js Service Provider #

This sample code is provided "as is" by SSO Engineering. We currently do not provide support for the sample code or for any issues that arise through its use. As an application developer, you are expected to have a working SSO implementation as part of the engagement process.

You can see a working example of this application at:
https://vmsssodemo01.amr.corp.intel.com/SamlNodeJs/

## Table of Contents ##
1. [Requirements](#requirements)
2. [How to Engage with SSO Engineering](#how-to-engage-with-sso-engineering)
2. [How to Set up the Sample Code on Your Server](#how-to-set-up-the-sample-code-on-your-server)

## Requirements ##

This sample application requires the following libraries:

**Express** This application requires the Express web framework for Node.js. Instructions to install this framework can be found at http://expressjs.com/.

**Passport** This application also requires the Passport and Passport-SAML libraries. Instructions to install these libraries can be found at http://passportjs.org/ and https://github.com/bergie/passport-saml.

Note: the current version (as of 04/17/2015) of the Passport-SAML library 
does not validate XML signatures correctly. To fix this, you can make a small 
modification to the file 
"path/to/node\_modules/passport-saml/node\_modules/xml-crypto/lib":
On line 499, change this:

        return canonXml.toString()

to this:

        var canonXmlString = canonXml.toString()
        canonXmlString = canonXmlString.replace(/&#xD;/g, "")
        return canonXmlString

This code requires a config.js file. A template file is provided, called 
config.template.js, but it must be renamed to config.js after any necessary 
modifications.

## How to Engage with SSO Engineering ##

You will need to engage with SSO Engineering in order to set up the sample application on your server or to set up your new or existing SAML application. See http://goto/engagesso for instructions.

## How to Set up the Sample Code on Your Server ##

1. Before you begin, you will need to engage with SSO Engineering. In order to get the sample application up and running, some configuration needs to be performed on Intel SSO systems. See above for instructions to engage.
    4. You do not need to fill out an engagement document. Simply state that you are setting up the sample SAML application.
    5. You will need to provide a Service Provider ID (SP ID) for your sample application. This can be anything you want, but it must be unique in the SSO systems. If you don't know what to use, make up some combination of your initials and your WWID.
    6. You also need to provide the full URL of the "/consume" path in the application, based on whatever domain name you're hosting it at.
2. Copy all the repository files into a folder on your server.
3. Install the Express library, the Passport library, and the Passport-SAML library.
6. Create the config.js file:
    1. Copy the contents of the config.template.js file into a new file called config.js.
    2. Open the new config.js file and make the following changes:
        3. saml.entryPoint: Set this to the login URL or SSO service URL provided by SSO Engineering.
        1. saml.issuer: Set this to a unique identifier for your application. This should be the SP ID that you provided to SSO Engineering.
        5. saml.cert: Set this to the base-64 encoded contents of the certificate file provided by SSO Engineering.
        6. samlIdpLogoutUrl: Set this to the logout URL provided by SSO Engineering.
