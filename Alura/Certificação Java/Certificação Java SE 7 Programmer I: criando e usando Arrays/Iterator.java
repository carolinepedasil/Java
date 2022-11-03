Collection<String> strings = new ArrayList<String>();
Iterator<String> iterator = strings.iterator();
while (iterator.hasNext()) {
    String atual = iterator.next();
    System.out.println(atual);
}


Collection<String> strings = new ArrayList<String>();
for (String atual : strings) {
    System.out.println(atual);    
}


Cliente guilherme = new Cliente();
guilherme.setNome("guilherme");

ArrayList<Cliente> clientes = new ArrayList<Cliente>();
clientes.add(guilherme);

System.out.println(guilherme.getNome()); // guilherme
System.out.println(clientes.get(0).getNome()); // guilherme

guilherme.setNome("Silveira");

System.out.println(guilherme.getNome()); // Silveira
System.out.println(clientes.get(0).getNome()); // Silveira