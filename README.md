# MDAP-team-backend
 Backend project
# 1-Technologies:
	-Spring boot
	-Spring security with jwt
	-Spring data jpa
	-Postgresql
	-Flyway database migration
# 2-Setup environment:
	-jdk 17: https://download.oracle.com/java/17/archive/jdk-17.0.7_windows-x64_bin.msi
	-postgresql 15 : https://sbp.enterprisedb.com/getfile.jsp?fileid=1258422
	-eclipse ide or inteliji: https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2023-03/R/eclipse-inst-jre-win64.exe
	-maven 3.8.8 or 3.8.6 : https://dlcdn.apache.org/maven/maven-3/3.8.8/binaries/apache-maven-3.8.8-bin.zip
# 3-Database connection server:
	-install postgresql 15
	-open pgadmin4
	-register server with properties below:
		-name: ancient-dream-219563
		-host name: ep-orange-cloud-657770.us-west-2.aws.neon.tech
		-post: 5432
		-username: baovh150401
		-password: ghtQiC3Sqc5v
		-role: baovh150401
	-save
	-after connect success, can use smiling-vervet-18_db database to query(only use select statement)
	-Note :Now can execute sql by pgadmin4, but when flyway is installed, that not change directly data by pgadmin4, all change data must execute by flyway
# 4-Run application
	-clone src code
	-setting jdk 17 and maven 3.8.8 for ide (eclipse or inteliji)
	-import project to ide
	-update maven (alt+f5 in eclipse)
	-clean project
	-run application
# 5-Api test collection
	-mock data to test:
		INSERT INTO roles(name) VALUES('ROLE_USER');
		INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
		INSERT INTO roles(name) VALUES('ROLE_ADMIN');
		run in pgadmin4
	-import file api-test.postman_collection.json to postman to test 
#....tobe continue update !!!
