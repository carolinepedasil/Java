public class DateTime {

    LocalTime currentTime = LocalTime.now(); // 09:05:03.244
    LocalDate today = LocalDate.now(); // 2014-12-10
    LocalDateTime now = LocalDateTime.now(); // 2014-12-10-09-05-03.244

    LocalTime time = LocalTime.now(ZoneId.of("America/Chicago")); 
    LocalDate date = LocalDate.now(ZoneId.of("America/Sao_Paulo"));
    LocalDateTime dateTime = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));

    LocalTime noon = LocalTime.of(12, 0);

    LocalDate christmas2014 = LocalDate.of(2014, 12, 25);
    LocalDate christmas2015 = LocalDate.of(2015, Month.DECEMBER, 25);

    MonthDay someChristmas = MonthDay.of(Month.DECEMBER, 31);

    LocalDateTime someDate = LocalDateTime.of(2017, Month.JANUARY, 25, 13, 45);

    LocalDate christmas2014 = LocalDate.of(2014, 12, 25);
    LocalDateTime christmasAtNoon = LocalDateTime.of(christmas2014, meioDia);

    LocalDateTime now = LocalDateTime.of(2014,12,15,13,0);
    System.out.println(now.getDayOfMonth()); // 15
    System.out.println(now.getDayOfYear());  // 349
    System.out.println(now.getHour());       // 13
    System.out.println(now.getMinute());     // 0
    System.out.println(now.getYear());       // 2014
    System.out.println(now.getDayOfWeek());  // MONDAY
    System.out.println(now.getMonthValue()); // 12
    System.out.println(now.getMonth());      // DECEMBER

    LocalDateTime now = LocalDateTime.of(2014,12,15,13,0); // 15
    System.out.println(now.get(ChronoField.DAY_OF_MONTH)); // 349 
    System.out.println(now.get(ChronoField.DAY_OF_YEAR)); // 13    
    System.out.println(now.get(ChronoField.HOUR_OF_DAY)); // 0  
    System.out.println(now.get(ChronoField.MINUTE_OF_HOUR)); // 2014
    System.out.println(now.get(ChronoField.YEAR)); // 1 (MONDAY)        
    System.out.println(now.get(ChronoField.DAY_OF_WEEK)); // 12
    System.out.println(now.get(ChronoField.MONTH_OF_YEAR));  

    LocalDate d = LocalDate.now();
    d.getHour(); //compile error, method not found.

    MonthDay day1 = MonthDay.of(1, 1); //01/jan
    MonthDay day2 = MonthDay.of(1, 2); //02/jan

    System.out.println(day1.isAfter(day2)); //false
    System.out.println(day1.isBefore(day2)); //true

    LocalDate aprilFools = LocalDate.of(2015, 4, 1);
    LocalDate foolsDay = LocalDate.of(2015, 4, 1);
    // são equals?
    System.out.println(aprilFools.isEqual(foolsDay)); //true
    // este objeto suporta dias?
    System.out.println(aprilFools.isSupported(ChronoField.DAY_OF_MONTH)); //true
    // este objeto suporta horas?
    System.out.println(aprilFools.isSupported(ChronoField.HOUR_OF_DAY)); //false
    // posso fazer operações com dias?
    System.out.println(aprilFools.isSupported(ChronoUnit.DAYS)); //true
    // posso fazer operações com horas?
    System.out.println(aprilFools.isSupported(ChronoUnit.HOURS)); //false

    LocalDate d = LocalDate.of(2015, 4, 1); //2014-04-01

    d = d.withDayOfMonth(15).withMonth(3); //chaining
    System.out.println(d); //2015-03-15

    LocalDate d = LocalDate.of(2013, 9, 7);
    System.out.println(d); // 2013-09-07
    d.withMonth(12);
    System.out.println(d); // 2013-09-07

    LocalTime d = LocalTime.now();
    d.withDayOfMonth(15); // compile error

    LocalDate d = LocalDate.of(2013, 9, 7);
    d = d.plusDays(1).plusMonths(3).minusYears(2);
    System.out.println(d); // 2011-12-08

    LocalDate d = LocalDate.of(2013, 9, 7);
    d = d.plusWeeks(3).minus(3, ChronoUnit.WEEKS);
    System.out.println(d); // 2013-09-07

    LocalDate d = LocalDate.of(2013, 9, 7);
                                            // UnsupportedTemporalTypeException
                                            //LocalDate não suporta horas!
    d = d.plus(3, ChronoUnit.HOURS); 
    System.out.println(d);

    LocalDateTime now = LocalDateTime.now();
    LocalDate dateNow = now.toLocalDate(); // de DateTime para Date
    LocalTime timeNow = now.toLocalTime(); // de DateTime para Time

    LocalDateTime now = LocalDateTime.now();
    LocalDate dateNow = now.toLocalDate(); // de DateTime para Date
    LocalTime timeNow = now.toLocalTime(); // de DateTime para Time

    // de Date para DateTime
    LocalDateTime nowAtTime1 = dateNow.atTime(timeNow); 
    // de Time para DateTime
    LocalDateTime nowAtTime2 = timeNow.atDate(dateNow); 

    Date d = new Date();
    Instant i = d.toInstant();
    LocalDateTime ldt1 = LocalDateTime.ofInstant(i, ZoneId.systemDefault());

    Calendar c = Calendar.getInstance();
    Instant i = c.toInstant();
    LocalDateTime ldt2 = LocalDateTime.ofInstant(i, ZoneId.systemDefault());

    Date d = new Date();
    Instant i = d.toInstant();
    LocalDateTime ldt1 = LocalDateTime.ofInstant(i, ZoneId.systemDefault());

    Instant instant = ldt1.toInstant(ZoneOffset.UTC);
    Date date = Date.from(instant);    

    Instant now = Instant.now(); // agora
    Duration tenSeconds = Duration.ofSeconds(10); // 10 segundos
    Instant t = now.plus(tenSeconds); // agora mais 10 segundos

    Instant t1 = Instant.EPOCH; // 01/01/1970 00:00:00
    Instant t2 = Instant.now();
    long secondsSinceEpoch = Duration.between(t1, t2).getSeconds();

    LocalDate birthday = LocalDate.of(1983, 7, 22);
    LocalDate base = LocalDate.of(2014, 12, 25);

    // 31 anos no total
    System.out.println(ChronoUnit.YEARS.between(birthday, base)); 
    // 377 meses no total
    System.out.println(ChronoUnit.MONTHS.between(birthday, base)); 
    // 11479 dias no total
    System.out.println(ChronoUnit.DAYS.between(birthday, base)); 

    LocalDate birthday = LocalDate.of(1983, 7, 22);
    LocalDate base = LocalDate.of(2014, 12, 25);

    Period lifeTime = Period.between(birthday, base);

    System.out.println(lifeTime.getYears()); // 31 anos
    System.out.println(lifeTime.getMonths()); // 5 meses
    System.out.println(lifeTime.getDays()); // 3 dias

    LocalDate birthday = LocalDate.of(1983, 7, 22);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
    System.out.println(formatter.format(birthday)); // 1983 07 22

    LocalDate birthday = LocalDate.of(1983, 7, 22);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
    System.out.println(birthday.format(formatter)); // 1983 07 22

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate d = LocalDate.parse("23/04/1986",formatter);
    System.out.println(formatter.format(d)); // 23/04/1986

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate d = LocalDate.parse("23/15/1986",formatter); // throws DateTimeParseException
    System.out.println(formatter.format(d)); // 23/04/1986

}