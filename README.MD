#### Goto Project Root Directory

##### Start the application...
```
./gradlew bootRun

```

##### Make a post call with email address to find out unique count

```
curl -X POST \
  http://localhost:8080/unique/emails/count \
  -H 'content-type: application/json' \
  -d '{
	"emails": ["mitesh.patel@gmail.com","mitesh.patel+3434l@gmail.com", "miteshpatel@gmail.com"]
}'

```


#### Run Test
```
./gradlew clean test

``` 