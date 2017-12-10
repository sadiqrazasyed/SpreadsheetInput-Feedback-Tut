# Send Feedback From Android App To Spreadsheet

Using this demo app, you will learn how to send app data (feedback) to a web spreadsheet (Google Sheets).

# What we will do
* Create a Google Form for receiving feedback
* Import the demo app 
* Investigate the spreadsheet to find the input hooks
* Post the user data from app to the spreadsheet using Retrofit

# Demo Previews
<img src="https://drive.google.com/uc?id=1Xa2zeKq4t-4l1njsnpsgeRnFPwPXdNVh" width="300"> <img src="https://drive.google.com/uc?id=1x6ULAtsypLKirt8J67CEwN0lSAVx3fkw" width="300"> 
<img src="https://drive.google.com/uc?id=106INU0Cl2sWGOM0jR8FkV_RRPiA8a82e" width="300"> <img src="https://drive.google.com/uc?id=1glLvoD1bzRduIAVcfqZC4dWqK_V22Vas" width="300">
<img src="https://drive.google.com/uc?id=1Z32oWuS-DW19aQYiru-mmHhdMNJWw0mO">

# How to Use

* Download/Clone this demo app
* Create a google form with the questions as follows

	- Feedback
  	- Name
    - Email
    ---
    
    <img src="https://drive.google.com/uc?id=1flLai5HfPFf5nFN3_EBzSAdW8fKwPqZR">
    
    ---
    - Now click on the "<b>eye</b>" button in your Google Form
    ---
 
    <img src="https://drive.google.com/uc?id=1J9uzix45F4T3u1g2IWPQJI-TR9GPEw7G">
    
    ---
    
When the form preview opens, right click and select ‘view page source’. You can now see the HTML for the page. Use your browser search function (CMD+F) and search for “<form”

(1), this will get you to the html for your form. The action of the form is the url we will be posting to 
(2). You then need to look for the <input> tags that have an id starting with entry. each one of these is the ID for one of your spreadsheet columns 
(3/4).
This screenshot shows the finding of the second ID

---
 
<img src="https://drive.google.com/uc?id=1B39AbjCK5wim0jH6ZtcypZbLTOzbw8LC">
    
---

From this we have:

*  Spreadsheet url:
https://docs.google.com/forms/d/e/1FAIpQLSd9jl6cAH5h8wmwFok8xh-ECLLpXWTqUopgzmNBQM5_xt3VMw/formResponse
* The id of the feedback column: entry.1942285924  
* The id of the name column: entry.1133595447
* The id of the email column: entry.414154651

---

* Now Import the demo app in Android Studio
 - Head over to app/java/com/sadiqrazasyed/spreadsheetinput/"<b>SpreadsheetWebService</b>"
 - Paste your URL ID, and Entry ID's
 
--- 

 <img src="https://drive.google.com/uc?id=1jGUcw1REZhSZT7UD1-ZJwgMULcq8r6hH">

---

* Now run the app & write your feedback, name, email and click on send button
* Your data will be sent to Google form's response section which can be viewed in Spreadhseet

---
# Libraries Used In This App

- [Retrofit2](https://github.com/square/retrofit)
- [MaterialStyledDialogs](https://github.com/javiersantos/MaterialStyledDialogs)
- [ConstraintLayout](https://developer.android.com/reference/android/support/constraint/ConstraintLayout.html)
- [CardView](https://developer.android.com/reference/android/support/v7/widget/CardView.html)

---

* Happy coding ;)




    
