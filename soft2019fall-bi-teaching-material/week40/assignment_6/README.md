# Assignment 6: Basic Machine Learning
This assignment introduces you to machine learning. Actually machine learning is just a fancy word for how machines can use old data to fit to some function, and make predictions on new data, which the machine has not yet "seen". The simplest predictions are linear and use formulae that you should recognize from your high-school math:

    y(x) = a*x + b

To predict the outcome of a linear model you need to know the ``a`` and ``b``,
so you can 'predict' the ``y`` value, when you input an ``x`` value.

If you want to become a bit more advanced, you can use a linear model with *two* or *more* inputs -- `x1, x2, x3, x4, ...`) here's a linear function of two variables :

    y = a*x1 + b*x2 + c

It is what we call a function _linear_ in `x1` and `x2`. Because the function value `y` depends on the unknown variables `x1` and `x2` to the first power, so meaning fx `x1^1`, at the most. Fx `x1^2` (or '`x1` squared') would be non-linear (a parabolic function value from `x1`, the unknown).

Our predictions might become even more precise, if we have more than one 'feature' to build our model function on: because we have one more explanatory factor to find out what the right value of `y` should be, namely now the two variables (or features) `x1` and `x2` -- and parameters `a`, `b`, and `c`, as input to our function, `y(x1, x2) = a*x1 + b*x2 + c`, which we wan to fit to the data.

## Part 1: Predicting Hackernews Points With Linear Regression in One Variable
For this part we would like to predict how long a user has to be active
from signing up on Hackernews, to achieve 1000 points. In this experiment our input variable is
time and our output variable is points. X (time) and Y (points).

### Part 1.1: Data preprocessing
The data can be found in JSON format in the file [``users.json``](https://github.com/datsoftlyngby/soft2019fall-bi-teaching-material/blob/master/week40/assignment_6/users.json) in GitHub.

Your job is to build and train a model that predicts how long a new user will have to work to accumulate 1000 points. 

Before you can know what model to use, have a look at the data: load it into a Pandas DataFrame and plot it on a graph. Remember to make your `X-axis` equal the time feature (since user's registration on Hackernews), and your `Y-axis` the number of points.

_Outcome 1.1: Hand-in a plot that shows time on the x-axis and number of points on the y-axis._

### Part 1.2: Model selection
The next part is to select an appropriate model. Study your data either visually or 
by going through the .csv file; what are you finding? What kind of model would it fit? 

Models could be fx.: Support Vector Machines, Decision Trees, k-Nearest Neighbors, ...

You can assume that models existing in `sklearn` is appropriate. You can use the Scikit-learn cheat sheet to guide you in your choice.

_Outcome 1.2: Describe with at least five lines of text: which model you chose, and why._

### Part 1.3: Model training
Next you'll must train your model. Remember the ML life cycle...

The training step will require you to create your selected model using one of the `sklearn` ML model classes (check cheat sheet again). Feed it data to *train* it.

_Outcome 1.3: Hand-in the code (markdown will do) that trains the data._

### Part 1.4: Model Validation
Now that you have a trained model you will need to validate it (check ML Wheel again). 

Validate your model. This should be done both intuitively, computationally, and visually. 

_Outcome 1.4: Hand-in ..._

_1. A one-page description of the model parameters -- number of which are model dependent: Why are they there? What is their purpose in the model? What do they explain for your data? How are they helping you to predict how much time you need to be active in order to gain Hackernews points?_

_2. A visual plot of the model that explains the description above. In the case of a linear regression this is a line that shows how the model expects how long a user needs to be active (x value) in order to get a certain number of points (y value)._

_3. Explain: What does it take to get 1000 points? How long would you have to be active on Hackernews?_

_4. Explain: how you have **sanity checked** your resulting trained/validated model: What does it take to get 1000 points? 500 points? 10000 points? 100 points? How long would you have to be active on Hackernews in those cases?_

## Part 2: Predicting Hackernews Points With _Multivariate_ Linear Regression
So far you pretended to be an un-advanced 'Hackernews' user with the goal of reaching 1000 points, only. But our model was pretty limited, since we just wanted to ger a hundred points -- no thought of how fast, when to start etc. One might say, that out business question was a bit too limited in scoping. Now, we only looked at time as the input variable. Who knows? Perhaps it depends on other features as well?

Linear regression is great for predicting inputs and outputs. But the linear
model you have probably just used, namely:

    y(x) = a*x + b

only include a single input variable, and two parameters `(a,b)`. 

Now, What if we want to include one more thing? Like number of upvotes?

    y = a*x1 + b*x2 + c*x3 + d

Or, what if we want to include many other effects, such as fx:

   1. The number of posts a user made?
   2. etc. ...
   3. etc. ...
   4. .
   5. .
   6. .
   7. The time a user signed up?
   
Then the model could look like this:

    y = a*x1 + b*x2 + c*x3 + ... + g*x7 + c

And so on. Your model is still linear, but now it contains many variables (features). If you think about it, each variable is the same as a dimension in space. So in the model where only time predicted points, you had a 2-dimensional plot. If you include the number of posts you have a 3-dimensional. _Et cetera_.

Going back to the Hackernews data set from the last assignment, use a linear model, where you use the feature **time** (x-axis) to predict the number of points (y-axis). But NOW -- in this new model -- include the feature **number of posts** as an addition to the model's predictive value of time.

That is, instead of _only_ using time to predict number of Hackernews points, use both _time_ **and** _number\_of\_ posts_ to predict the number of Hackernews points.

_Outcome 2:_ Hand-in ...
  * A description of the parameters
  * An analysis of how much time you need to be active on Hackernews, plus how many posts you need to reach 1000 points.
  * Explain: how much does the number of posts contribute to get the points? How much do the time since registration explain?

## Part 3: Prediction of breast cancer malignity
#### A Classification Task
In our previous examples we tried to predict a numerical variable, namely
points. Points can have values from 0 and upwards, in a continuous space.
But what if we work with things that aren't continuous? Like grades
(-3, 0, 2, 4, 7, 10, 12) or cars
(Nissan, Toyota, Tesla...) or perhaps genders (male, female, other), or weather (rain, no rain)?

To do that we need classification. Classification allows us to predict things that are not a continuous number, but instead divided into categories.

We will be using a new dataset based on
[breast cancer patients](http://archive.ics.uci.edu/ml/datasets/Breast+Cancer+Wisconsin+%28Diagnostic%29) in Wisconsin, USA. Our goal is to _predict whether cancer is benign or malign_. One, or, the other. 

Is this an important binary classification task, or what?? Think of the amount of people who would be treated timely, rather than waiting for a medical doctor to have time to making a first screening of mammographs to narrow possibly critical cases down to a few percent of the clients. It would perhaps save many lives if this could be done automatically (to some extenxt). Here, at least one of the UN world goals come into play. Mention that, and identify the possible golas, in your hand-in report.

### Part 3.1: Looking at the data
Load the data from this ``.csv``:
[http://archive.ics.uci.edu/ml/machine-learning-databases/breast-cancer-wisconsin/wdbc.data](http://archive.ics.uci.edu/ml/machine-learning-databases/breast-cancer-wisconsin/wdbc.data).
Have a look at the data before you get started with the analysis. 

_Outcome 3.1:_ Report the ``head`` of the table. Write two lines about notable features of the data. How big is your dataset? What are the different variables? Etc...?

### Part 3.2: Building the model
Our goal is to predict whether the we have observed benign or malign cancer.

For this part you can choose the input variables, but you must use _at least_ three: which ones do you think have the most impact? Can you tell by data inspection directly? Intuition? Statistics of the data set? Anyway: choose at least two features to choose/train/validate your model upon.

_Outcome 3.2:_ Hand-in a description of your chosen variables and why you think they could help predict breast cancer.

### Part 3.3 Evaluating the model
Now take the data from dataset and train your chosen model. 
To figure out how good your model was, use the function here
``sklearn.metrics.accuracy_score``. 
It gives you an accuracy that tells you how good your model is 
able to predict whether a tumor is benign or malignant.

_Outcome 3.3:_ Hand-in ...

  * the accuracy of the score 
  * five lines describing what that number of accuracy actually means.
  * is the data set 'balanced'?
  * should a ROC curve-based or perhaps a precision-recall optimization be used here?
  * what can the number tell you when you inform patiens whether their cancer is benign or malign?
  * do you dare do synthetic minority oversampling synthesis (SMOTE) -- if needed (check labelling 'balance') -- on this data to obtain higher accuracy? (this is a serious question if you are working in health care for real!)
 
## Hand-in Procedure

  * Hand-in a link to the **release** on Peergrade.
  * The hand-in (on Peergrade) should be a link to a GitHub **release** containing a
**single** Jupyter Notebook file (e.g. ``assignment6.ipynb``) with the code, plots and written text for the assignment parts.
  * Hand-in at latest on Wednesday Oct. 16th, 2019, 08:30.
  * Hand-in as groups! Work as groupS, groUPS, GROUPS!  :o) 
