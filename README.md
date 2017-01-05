# FerryCaseBackend

Welcome to the github repo of Group Å's backend project.
This project is made as a school project with continous integration and delivery in mind, thus the main focus is on these parts. This project was intended for learning purposes only.

Specifically we used Jenkins and a private artifactory to do this.

Our Jenkins is setup in a way that allows us to continually build and push to this repo and Jenkins then checks the repo every half hour to build a new version should there be a new push to the master branch. Ideally you would have a seperate branch to build from, allowing you to do all your merging and stuff on the master branch to check for any problems before pushing to the build branch allowing Jenkins to check the entire thing more thorough.
Jenkins also makes a build on a daily basis no matter if there are any changes present, this obviously is somewhat redundant with a build branch.

Jenkins then pushes to our artifactory on a successful build.

How we setup the project! What would they have to do, to get the same results!
