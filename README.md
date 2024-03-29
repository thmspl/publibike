<p align="center">
  <img alt="publibike logo" src="https://github.com/thmspl/publibike/blob/develop/.assets/images/publibike_logo.jpg?raw=true" width="300" />
</p>
<p align="center">
  <img src="https://github.com/thmspl/publibike/workflows/Maven%20build/badge.svg" />
  <img src="https://github.com/thmspl/publibike/workflows/Maven%20publish/badge.svg" />
  <a href="https://opensource.org/licenses/MIT"><img src="https://img.shields.io/badge/License-MIT-yellow.svg" /></a>
</p>

<p align="center">A Java wrapper for the PubliBike API to fetch informations about the bicycles.</p>

On the official website of PubliBike you can find a map with all stations and the specific amount of vehicles at those stations ([here](https://www.publibike.ch/de/publibike/stations)). So I found out that the map is using 2 public endpoints which can be used to gather informations about the stations and vehicles.

## Endpoints

These are the endpoints I've discovered:

````
GET https://api.publibike.ch/v1/public/stations

GET https://api.publibike.ch/v1/public/stations/{ID}
````

## Maven

````xml
<dependency>
  <groupId>ch.phatec</groupId>
  <artifactId>publibike</artifactId>
  <version>1.5</version>
</dependency>
````

## Getting started

**Fetch all stations.**

````java
PublibikeService service = new PublibikeService();

List<Station> stations = service.getStations();
````

**Fetch one station.**

````java
PublibikeService service = new PublibikeService();
Long stationId = 100L;

Station station = service.getStation(stationId);
````

**Get all vehicles at a station.**

````java
PublibikeService service = new PublibikeService();
Long stationId = 100L;

Station station = service.getStation(stationId);

List<Vehicle> vehicles = station.getVehicles();
````
