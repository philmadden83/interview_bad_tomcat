# Basic API

This terribly basic API is intended to respond with the contents of the environment variable `ENVIRONMENT`. 

#### Building

```
docker build -t vividseats/bad_api:v1 .
```

#### Running
```
docker run -d -p 8080:8080 --memory="500m" vividseats/bad_api:v1
```

#### Usage

```
curl http://localhost:8080
```
