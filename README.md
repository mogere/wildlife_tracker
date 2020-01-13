# Project Hero Squad
### Description
This project allows a ranger to record sightings of various animals, including endangered
species most likely present in a game reserve. Endangered species' details are keenly recorded 
including the location spotted and their health.

### BDD
|feature     |Description      |
|------------|------------------
|Show animals | Show a list of animals in reserve|
|Record animal sighting|Fill form which takes in the animals spotted details|
|List sightings|Show a list of animal sighted details|


### Contributors
* Philip Nyatichi 


### Technologies used 
* Java (Spark)
* Git for version control
* Heroku for hosting
* Postgresql Database

### setup
Download Java Development kit 11. Previous or later versions may
have some minimal compatibility issue. Gradle is the tool used to 
build and run the code. Preferred IDE is IntelliJ IDEA.

#####In PSQL:
CREATE DATABASE wildlife_tracker;
CREATE TABLE animals (id serial PRIMARY KEY, name varchar);
CREATE TABLE tasks (id serial PRIMARY KEY, location varchar, animal_id integer, type varchar, ranger varchar, time date );

## Want to propose any changes?
- Fork repository
- Create new branch
- Make the proposal
- commit the changes with appropriate message on changes and push
- Create a pull request

## License
MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.