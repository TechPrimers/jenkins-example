#!groovy
import groovy.json.JsonOutput
import groovy.json.JsonSlurper
node {

    // server = Artifactory.server "artifactory"
     //buildInfo = Artifactory.newBuildInfo()
     //buildInfo.env.capture = true
    
    // we need to set a newer JVM for Sonar
    //env.JAVA_HOME="${tool 'Java SE DK 8u131'}"
    //env.PATH="${env.JAVA_HOME}/bin:${env.PATH}"
    
    // pull request or feature branch
    if  (env.BRANCH_NAME == 'master') {
        checkout()
	    formaster()
        } 
        
    else if (env.BRANCH_NAME == 'develop'){ 
        checkout()
        unitTest()
    }
    else if (env.BRANCH_NAME == 'feature-1'){ 
        checkout()
        unitTest()
        feature()
    }

    else {
        printf "error"
    }
    
}

def checkout () {
    stage 'Checkout code'
    context="continuous-integration/jenkins/"
    checkout changelog: false, poll: false, \
	              scm: [$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: \
	                 [[$class: 'ScmName', name: 'gradle']], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'Database', \
	                 url: 'https://github.com/yeshwanthreddy77/jenkins-example.git']]]
}

def build () {
    stage 'Build'
    echo "build step"
    //mvn 'clean install -DskipTests=true -Dmaven.javadoc.skip=true -Dcheckstyle.skip=true -B -V'
}
def formaster () {
    stage 'formaster'
    echo "build step master"
    //mvn 'clean install -DskipTests=true -Dmaven.javadoc.skip=true -Dcheckstyle.skip=true -B -V'
}

def unitTest() {
    stage 'Unit tests'
   // mvn 'test -B -Dmaven.javadoc.skip=true -Dcheckstyle.skip=true'
   
}
def feature() {
    stage 'feature branch stage'
}



//def buildAndPublishToArtifactory() {       
//        def rtMaven = Artifactory.newMavenBuild()
  //      rtMaven.tool = "Maven 3.x"
    //    rtMaven.deployer releaseRepo:'libs-release-local', snapshotRepo:'libs-snapshot-local', server: server
      //  rtMaven.resolver releaseRepo:'libs-release', snapshotRepo:'libs-snapshot', server: server
//        rtMaven.run pom: 'pom.xml', goals: 'install', buildInfo: buildInfo
  //      server.publishBuildInfo buildInfo
//}





//def mvn(args) {
  //  withMaven(
        // Maven installation declared in the Jenkins "Global Tool Configuration"
    //    maven: 'Maven 3.x',
        // Maven settings.xml file defined with the Jenkins Config File Provider Plugin
        
        // settings.xml referencing the GitHub Artifactory repositories
      //   mavenSettingsConfig: '0e94d6c3-b431-434f-a201-7d7cda7180cb',
        // we do not need to set a special local maven repo, take the one from the standard box
        //mavenLocalRepo: '.repository'
    //    ) {
        // Run the maven build
      //  sh "mvn $args -Dmaven.test.failure.ignore"
    //}
//}

//def getBranch() {
  //  tokens = "${env.JOB_NAME}".tokenize('/')
    //branch = tokens[tokens.size()-1]
    //return "${branch}"
//}
