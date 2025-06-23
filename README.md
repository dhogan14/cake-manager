<a id="readme-top"></a>
<div align="center">
<h3 align="center">Cake Manager</h3>
  <p align="center">
    A microservice to manage cakes.
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

This microservice is made to manage your cakes locally. 
A cake is described in the project by its id, title, description and image link.
There are several cakes saved initially which you can edit as you wish.

With this project you can:
* List all saved cakes.
* Add a new cake.
* Update a cakes' entry.
* Delete a cakes' entry.

In depth details of how to run and use this project are described below.

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- GETTING STARTED -->
## Getting Started

This is a small project with just a few setup instructions.

Below is an example of how you can instruct your audience on installing and setting up this service.

1. Clone the repo
   ```sh
   git clone https://github.com/github_username/repo_name.git
   ```
2. Run the command
    ```sh
    mvn clean install
    ```
   This installs the required dependencies. It should only need to be run before starting the project locally for the first time and may take a few minutes.
3. Run the command
   ```sh
    mvn spring-boot:run
   ```
4. The project will initialise the local memory with the starting cakes. This should only a few seconds and once you see "db init complete" in the console output the project is ready to receive requests!

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
## Usage

There are 4 APIs in this project: list, add, update and delete.

### 1. List
URL: localhost:8080/cakes

REST method: GET

Request parameters: N/A

Request Body: N/A

Response(s):
* 200 OK - A JSON list of cakes.

### 2. Add
URL: localhost:8080/cakes/add

REST method: POST

Request parameters: N/A

Request Body: A JSON object of the cake to be added. The id can be left out or should be empty/null.

Response(s):
* 200 OK - A JSON list of cakes.
* 400 BAD_REQUEST - The cake couldn't be added.

### 1. Update
URL: localhost:8080/cakes/update

REST method: POST

Request parameters: N/A

Request Body: A JSON object of the cake to be updated.

Response(s):
* 200 OK - A JSON list of cakes.
* 400 BAD_REQUEST - The cake couldn't be updated.

### 1. Delete
URL: localhost:8080/cakes

REST method: DELETE

Request parameters: N/A

Request Body: A JSON object of the cake to be deleted.

Response(s):
* 200 OK - A JSON list of cakes.
* 400 BAD_REQUEST - The cake couldn't be found so no deletion has occurred.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTACT -->
## Contact

Donal Hogan - Software Engineer

Project Link: [https://github.com/your_username/repo_name](https://github.com/your_username/repo_name)

<p align="right">(<a href="#readme-top">back to top</a>)</p>
