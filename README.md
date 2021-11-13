# Stringy Spells
>The Wizards Council is working on new sets of spells to teach the up and ocming wizard trainees.  These are all magic based on word analysis and choice.  Help the mages construct new spells by completing the tasks below.

## Objectives required to complete
This quest has us working with methods and `String` objects.  We have a goal to determine various pieces of information about a number of pairs of `String` objects.

### Objective 1 - Cloning the project
Accept the assignment via the link on LHSTech or the GitHub Classroom.

### Objective 2 - Making a Plan 
Make a plan of attack on the assignment's specs below.

### Objective 3 - Commit AND Push
Remembering to commit and push on a regular basis will help you stay current on tests and tasks.

## Quest Requirements
**All methods should be static and method names should be as stated in order to avoid errors on unit tests.**


### Objective 1 - The methods
There are several various pieces of information we can pull from an array of numbers.  Doing these methods help us with method writing, array traversal, variable scope, and method calling.

- Sum the elements `sumElems`

- Average the elements `avgElem`

- Count occurrences `countOccurs`
	- count the number of occurrences in the array of a passed value
	- the array should be the first param

- Determine presence or absence of a value `appearsIn`
	- use the `countOccurs` to help
	- result should be `true` or `false`
	- the array should be the first param

- Determine first location `firstAppear`
	- find the first index of a passed value
    - the array should be the first param
    - return -1 if not found

- Find the minimum number `minValue`

- Find the maximum number `maxValue`

- Find the range `rangeValue`
	- use `minValue` and `maxValue` to help
	
### Objective 2 - Finishing the main
- Call all the methods on each array in the main
- Display the various results to the user in a friendly format

**Bonus**
Find the standard deviation of an array of the following: 600, 470, 170, 430, 300, 280, 389

- Calculated standard deviation rounded to the nearest whole number
- Only outside method you are allowed to call is `Math.sqrt()`
	- no other outside Java methods or methods a "friend" has helped you with

Formula for standard deviation for our purposes is `the square root of the variance`.  The variance is defined as `the average of the squared differences from the mean`.

### Objective 2 - Pushing
Reminder to push code from `IntelliJ` back to GitHub.  Another reminder to merge back into master before making the final push.


#### Grading
|   Points     |   Requirement    |
| :----------: |:---------------- |
| 2            | ZZZ              |
| 2            | YYY              |
| 2            | Bonus correct    |
