# 서블릿 JSP 기초


프로젝트 분리하여 다루기
  서버에서 server.xml 파일에서
''' xml
<Host appBase="webapps" autoDeploy="true" name="localhost" unpackWARs="true">
'''
  코드 아래에 아래 코드 추가
''' xml
<Context path="URL경로" 
	docBase="작업폴더" 
	privileged="true" />
'''
