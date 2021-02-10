##Docker subir aplicacao 
sudo docker-compose up --build --force-recreate

##Acesso para lista de processos: 
https://dashboard.heroku.com/apps/sigo-back-gestao/api/processo

##Acesso processo unico: 
https://dashboard.heroku.com/apps/sigo-back-gestao/processo/{id}

##Salvar, Atualizar e Deletar processo: 
https://dashboard.heroku.com/apps/sigo-back-gestao/processo

##Acesso para lista de operadores: 
https://dashboard.heroku.com/apps/sigo-back-gestao/api/operador

##Acesso operador unico: 
https://dashboard.heroku.com/apps/sigo-back-gestao/operador/{id}

##Salvar, Atualizar e Deletar operador: 
https://dashboard.heroku.com/apps/sigo-back-gestao/operador

##Recompilar node_modules
rm -rf node_modules package-lock.json && npm install
mvn clean package

##Rodar teste
mvn test

##Gerar build 
mvn spring-boot:run
#sudo service postgresql stop
#sudo docker-compose down

##Subir .jar java
java -Dserver.port=5050 -jar target/pucsigo-0.0.1-SNAPSHOT.jar

