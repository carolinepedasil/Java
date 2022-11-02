import java.util.ArrayList;

ArrayList<String> nomes = new ArrayList<String>();

ArrayList<String> nomes = new ArrayList<String>();
nomes.add("certificação");
nomes.add("java");


ArrayList<String> nomes = new ArrayList<String>();
nomes.add("certificação");
nomes.add("java");

System.out.println(nomes.contains("java")); // true
System.out.println(nomes.contains("c#")); // false

// true, encontrado e removido
boolean removido = nomes.remove("java"); 

System.out.println(nomes.contains("java")); // false
System.out.println(nomes.contains("c#")); // false

ArrayList<String> nomes = new ArrayList<String>();
nomes.add("certificação");
nomes.add("java");
System.out.println(nomes.size()); // imprime 2

ArrayList<String> nomes = new ArrayList<String>();
nomes.add("certificação");
nomes.add("java");

Object[] nomesComoString = nomes.toArray();

ArrayList<String> nomes = new ArrayList<String>();
nomes.add("certificação");
nomes.add("java");

String[] nomes2 = nomes.toArray(new String[0]);
String[] nomes3 = nomes.toArray(new String[nomes.size()]);


ArrayList<String> nomes = new ArrayList<String>();
nomes.add("certificação");
nomes.add("java");

ArrayList<String> paises = new ArrayList<String>();
paises.add("coreia");
paises.add("brasil");

ArrayList<String> tudo = new ArrayList<String>();
tudo.addAll(nomes);
tudo.addAll(paises);
System.out.println(tudo.size()); // imprime 4

ArrayList<String> nomes = new ArrayList<String>();
nomes.add("certificação");
System.out.println(nomes.get(0)); // imprime certificação

ArrayList<String> nomes = new ArrayList<String>();
nomes.add("certificação");
System.out.println(nomes.get(0)); // imprime certificação

nomes.add(0, "java");
System.out.println(nomes.get(0)); // imprime java
System.out.println(nomes.get(1)); // imprime certificação

ArrayList<String> nomes = new ArrayList<String>();
nomes.add("java");
nomes.add("certificação");

String removido = nomes.remove(0); // retorna java
System.out.println(nomes.get(0)); // imprime certificação

ArrayList<String> nomes = new ArrayList<String>();
nomes.add("java");
nomes.set(0, "certificação");

System.out.println(nomes.get(0)); // imprime certificação
System.out.println(nomes.size()); // imprime 1

ArrayList<String> nomes = new ArrayList<String>();
nomes.add("guilherme");
nomes.add("mario");
nomes.add("paulo");
nomes.add("mauricio");
nomes.add("adriano");
nomes.add("alberto");
nomes.add("mario");

System.out.println(nomes.indexOf("guilherme")); // 0
System.out.println(nomes.indexOf("mario")); // 1
System.out.println(nomes.indexOf("joao")); // -1
System.out.println(nomes.lastIndexOf("mario")); // 6
System.out.println(nomes.lastIndexOf("joao")); // -1
