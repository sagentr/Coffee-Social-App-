# Coffee-Social-App-
Tentative Plan for User Profile Feature: 

The Java backend component will be made up of an MVC that generates user profile objects. The login will be
either attached to a secure repository (if time allows), or we will implement Oauth into the initial Create profile
object to remember user credentials for the MVC. 

Profiles will be able to store the following information from users: Email (normally necessary for communication between
the site and users and to confirm user identities), Username (necessary to create unique profiles), First name (or 
first initial), a short about me limited to 500 characters, and additional sub-prompts to the about (within the edit profile
landing for users who already have an account) limited to 200 characters asking users to specify coffee tastes/favorite coffee
roasts, and food pairings with coffee. Additionally, included is an automatically generated UserId to be used in the reviews
repository to attach reviews to their respective users. 

I have prepared controllers for: 
A landing "Create New User Profile" page (a sign-up page)
An Edit Profile View for returning users (for the additional sub-prompts for "about me", and also to include a "delete profile" option, 
and option to upload a profile photo--if time allows us to implement the photo upload feature)
A "View Profile" View (which calls the information from Username, First name, About me, and the sub-prompts, and potentially the profile photo).

If I have the time to make a repository for the login information, I would like to of course implement password encryption, but
 also more validation in the form process to keep bots out in our user sign up process. 
------------
The review feature includes one of the main concepts for the app: to document an avid coffee drinker's experiences cup by cup. On the front end side, there are three big components. The first is to create the initial review, the second is to review your personal library of reviews with limited info on each entry, and the last to inspect these previous reviews to see all the information. The front end is using a reactive form with validation. An object is created to store these details to send to backend using http requests. The library and consequent previous post inspection will depend on the backend implementing the data, but will be templated by the front end.  The MVP of a review will include the following details:
-time stamp *displayed in library.*
-name of business *displayed in library. - link/collab to maps feature to tag on their end*
-name of beverage
-atmosphere
-overall rating *displayed in library.*
-personal summary

