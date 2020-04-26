# Project 4

This project aims to provide the data/business foundation for project 5.
You should formulate a business case, possible data sources and contents/formats of data.

Please note that the parts below *cannot* be solved sequentially.
Before you find your interesting business question you need to make sure that there
exists a data source that can help you answer the question.

## Part 1: Business case
In this part you are supposed to identify an *interesting* business question,
that you would like to answer.
The question has to be in the form of a prediction (think about the examples in class):
stock pricing, forest fires, murders, etc.

This is also your chance to find something that you find interesting. 
But make sure that the question **can be answered**.
It's OK that the question is ambitious, but you have to be able to answer it
with the tools that we learned throughout the course.

Hand-in:
* A precisely formulated question using no more than 20 words
* At least 50 words of text that motivates *why* the business question is interesting
* At least 40 words of text that describes which concepts from class you will have to
  use to answer the question.

## Part 2: Data
**While** you discover your business question you need to know whether you can
actually answer that question.
This project part exists to make sure that you have the necessary data foundation.
Your data will have to be accessible to all (also your reviewers), large enough
(at least 50'000 data points), and *useful* (does it help to answer the business question).
It is naturally ok to have several data sources. 
You have to argue why the data source is needed.

#### If you do not have enough data points
If you cannot find data sources that are large enough you have to explicitly describe 
(with at least 20 words)
1. why it's ok to include a smaller data set and
2. how you will compensate for the fact that you have fewer data points
  * Can/will use data synthesis?
  * Can/will you regularise the data?

Hand-in:
* A link to the data resource online along with at least 20 words of text describing the 
  data source
  * Include a description of the data features and the size of the data
  * If you do not have enough data points, include the points from the section on
    'If you do not have enough data points'
* An **automated** method to download the data in a `.py` file
  * You do not have to do any preprocessing (yet)

## Part 3: Data content and format
Lastly, you have to relate the data to your business question.
Make it explicit exactly how can use the data to answer your business question.
Think about what format is necessary and which features you need.
Do you need to perform some preprocessing to extract the features?

Hand-in:
* At least 40 words describing how the data can help you answer your business question
* At least 3 model types that can help you answer your business question
* A list of features that you would like to include to answer your business question. 
  For each feature you need to describe:
  * Feature name (what is it?)
  * What it explains (why is it relevant?)