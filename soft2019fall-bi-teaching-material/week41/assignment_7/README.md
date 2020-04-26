####Assignment 7
#Basic ML - Class Prediction

One of the biggest challenges in real estate broking is -- not surpringly -- correct pricing. 

## Supervised Machine Learning; classification.

In this assignment we return to the Boliga data. The objective is to build a classification machine learning model from scratch. One _suggestion_ for some tooling is Azure Machine Learning Studio, AML. You will try to predict whether an estate sale will sell _over_, _at_, or _under_ the broker's initial pricing. What does that amount to? It amounts to classification model. 

How many classes do we have for this business case question? You can choose to base your model on 2 or more classes -- as we talked about during lectures.

Put the answer in your hand-in and argue about what other good business questions could be posed from the Boliga data. It could also be that regression models could answer some interesting questions, mind you.

### Part 1: Data processing
Get the Boliga data, including the geolocations, into your favorite machine learning tool. This could be AML, fx, but it is your choice. 

You will need to work on the target variable (class label) as it is an integer -- but should be categorical. Other things to consider are:

Is the data 

  * clean, 
  * meaningful, 
  * well formed (æ,ø,å, etc) 
  * balanced, do you need to _re-balance_ the data,
  * how to re-balance, if needed?

Regarding the issue of balanced data sets, you should read the Jupyter notebook _'./week41/lecture_notesImbalanceResamplingStrategies.ipynb'_ in GitHub. But stay with simple deletion of rows to balance your classes; remember that you have about 1.5 million rows.

### Part 2: ML model selection and construction 
Build a classification model, the objective being to predict whether a housing sale price would be adjusted or not adjusted. 

### Part 3: Training & Validation
Take out about 50 rows from each class in a separate dataframe, for your prediction step. Let's call them the _validation_ data set.

Split the remaining (many!) rows in _training_ and _test_ data. 

With your _training_ and _test_ data set, train your model and evaluate (test) it. Determine its performance by either:
  1. _If you made a binary classifier model;_ inspecting the ROC curve -- if data are balanced, or the Precision-Recall curve -- if data are un-balanced. 
  2. _If you made a multi-level classifier model;_ inspecting the confusion matrix and compute _accuracy_, _precision_, and _recall_, for all classes (remember 3 classes => 3x3 conf.mat.).

### Part 4: Report your findings (BI)
Plot your predicted classes, for the 50 rows per class you kept aside (_validation_ data), on a map of Denmark. Also plot true class of the price change next to the predicted class (with a different symbol fx).

Use your knowledge of visualization taxonomy to color, size and place the points on the map.

Write a brief 5-10 lines report, on your findings and conclusions from your prediction validation.

### Part 5: House Keeping
Clean up your work space when you're done, if you chose AML or other paid ML as-a-Service. You don't want unnecessary waste of resources, which you might want to use at a later time. And you definitely should avoid paying for it...

## Hand-in Procedure

  * Hand-in a link to the **release** on Peergrade.
  * The hand-in (on Peergrade) should be a link to a GitHub **release** containing _sufficient_: 
    - plots and screenshots of various visualizations
    - written text on findings and conclusions 
    for the assignment parts, to convince me that you pulled through.
  * Hand-in at latest on Wednesday Oct. 23rd, 2019, 08:30.
  * Hand-in as groups! Work as groupS, groUPS, GROUPS!  :o) 
