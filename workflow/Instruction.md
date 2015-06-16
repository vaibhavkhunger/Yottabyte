

1. Build the package
      mvn clean package -Duser=akashm
2. copy the tar.gz file to edge node
    scp target/<jarname>.tar.gz <username>@<ip-address>:~/
3. SSH to edge node
    <username>@<ip-address>:~/
4. Untar the zip
    tar -xvf <jarname>.tar.gz
5. Copy Workflow dir to hadoop user directory
    hadoop fs -put <jarname>/workflow 
6. Run the oozie client. 
    oozie job -oozie http://localhost:11000/oozie -config <jarname>/resources/config.properties -run    
    
    
    