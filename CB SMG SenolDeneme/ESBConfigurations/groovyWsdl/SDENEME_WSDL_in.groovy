System.out.println(xmlInput);

request = new ESBWsdlRequest("data/groovyWsdl/"+groupCode +".wsdl",xmlInput,actionType,soapBinding);

request.generateRequest();

output= request.getSoapRequestXml();
