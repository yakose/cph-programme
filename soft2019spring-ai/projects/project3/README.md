# Project 3: A Neural Network Classifier, Tuned.

This assignment continues our treatment of supervised machine learning, in particular now using Neural Network (NN) models. In essense you will be experimenting with training and validation of NNs, and benchmarking against k-Nearest Neighbors (kNN) on the male/female voice dataset from Hand-in Assignment 2. 

You will be choosing a matrix of hyperparameters and network topologies (layers, activation functions, etc), to test convergence and confusion statistics for both kNNs and NNs during this project.

Perhaps go above and beyond to check the basic NN concepts. You should look into, particularly, MLPs and deep NN topologies (how many layers, what kind, etc.), drop-out rates, activation functions, training convergence.




--------------------------
### Part 0: Business Case
The voice dataset from Kaggle is interesting in the sense that it is an extremely straigforward way to hook up to a telephone and label all calls to devices fx. No data is kept, no personal sensititve information needs to be recorded but the information could be valuable. Are one or the other gender, or both, or none, more prone to seek medical assitance during springtime? Perhaps a bit farfetched, but it serves the purpose of playing "business case".

**_Hand in a few paragraphs with some more thoughts on possible business cases. Could we treat streaming data with these simple models only adding a bit of data preprocessing from audio streams? Or something else?_**




--------------------------
### Part 1: Data Exploration & Preparation -- Revisited
You have already worked on this part. Still, a few very interesting points were brought up in classroom discussions this week. Again, your job is to identify potential problems and potential optimizations on feature space, and the labels that you're predicting.

Look into the following a bit more elaborately:

- Download the voice.csv data and explore. 
- Do we see correlations in feature space? 
- If any: are they true/justifiable correlations (or anti-correlations)?
- If so, should -- or could -- we remove/discard features from our work with the NN and kNN models?
- Are there scaling issues w.r.t. feature ratios (fx a=[-.03,0.74], b=[-20000.,9999.])?
- Highly skewed distributions (mean, standard deviation, skewness, kurtosis ...)?

**_Hand in 2 pages describing your data wrangling, and your investigation on feature correlations. Show that you understand what correlation, un-correlation and anti-correlation is. Some reasoning as to why some might be correlated while others are un-correlated. Include code/plots, whatever is needed to understand your work you answer._**



------------------------------
###  Part 2: Model construction
We will use two models: Neural Networks and k-Nearest Neighbours. Both model classes shall be used as binary classifiers on the voice.csv data from Kaggle. The interesting thing to test is of course whether kNN does better or worse or the same as NNs.

#### Part 2.1: k-Nearest Neighbours
Runs out-of-the-box, but you should consider all variable aspects of the algorithm, start with scikit-learn docs, and the question of hyperparam(s?). 

#### Part 2.2: Keras Neural Networks
The new interesting part of the this project concerns Neural Networks. Code up a network similar to what was demonstrated during lectures, week 12, namely in _'Predicting with NN.ipynb'_. 

**_Hand in the code for constructing and varying the topology of the NN, and your reasoning behind the chosen construction of the NN and the kNN. Include a one-pager explaining any detail that you deem valuable to discuss._**






------------------------------
### Part 3: Model Training and Validation, Hyperparameter Grid Search

#### Model Training and Validation
We need to experiment with our models -- how the models were trained and validated. How did you use your data for training, based on your observations in Part 1 above? 

  - Excluded/included features?
  - Experimentation with the curse of dimensionality?
  - 80/20, 50/50, or other, splitting?
  - Splits: stratified, random, ...?
  - did you do ensemble learning like _bagging_, _boosting_?
  
1. You should experiment with your training on:
   - the data set, with labels as-is (balanced data)
   - an _un_-balanced data set, e.g. remove 60% of the male cases..
   - an _re_-balanced data set, where you have oversampled your _un_-balanced data with the SMOTE technique.

2. You should vary parameters for the Neural Network, investigating how changing the NN affects its performance. So, vary fx:
  - Network topology
    - number of layers, number of neurons
  - Activation functions, Biases, Network Initialization, Dropout rates

3. You should produce adequate metrics, and accompanying plots:

  - Confusion matrix
  - Accuracy/Precision/Recall
  - ROC curve, Prec-Recall curve: ROC or P-R? Remember all that fuzz with balanced data sets...

**_Hand in thorough reporting on your choices of:_**
<strong>  
  - features, from correlation studies in Part 1, and some common sense
  - training and validation splits. If applicable: bagging/boosting/ensemble learning
  - experiments with un-/re-/balanced datasets.
  - network topologies as of Part 2 and Part 3.2 above.
  - metrics, and how metrics are influenced by un-balancing/re-balancing the dataset 
</strong>

**_NB: Your reasoning behind those choices and the outcomes is in focus here. Include sufficient plots and numbers to support your conclusions on the training/validtion._**

#### Hyperparameter Grid Search
The hyperparameter search is given by the kNN and NN parameter input and the NNs' topologies. Choose a reasonable range of parameters, making sure that you cover a good portion of the relevant parameter space.

**_Hand in your hyperparameter grid as a table per model (or several tables if needed). Include in the tables figures of performance of kNN and NN for your choices of tuning params. NB: the 'score' output may not be sufficient._**

----------------------
### Part 4: The 5-feature Challenge
This is a test of your ability to combine Parts 1-3 from above into one single objective: 

#### Optimize your models, using only 5 features.

**_Hand in a list of your favorite 5 features, meaning those features that give you the best performance, and that arguably are the most important 5 features. Hand in a two-page report with explanation and argument for your choices._**
