Definitioner
============

GTIN: Global Trade Item Number. Det nummer som varje streckkod motsvarar.

Nollte iterationen
==================

*2014-04-17*

`models.Product` är primärt en databehållare. Instanser av denna kommer att
bollas runt hit och dit i applikationen.

`models.Database` håller en anslutning till en SQLite-databas, och tar hand om
lågnivåoperationer. Målet är att den ska kommunicera med resten av applikationen
genom standarddatatyper så långt det går. Databasen skickas in med (manuell)
dependency injection överallt där den behövs.

`models.ItemLookup` som behöver ett bättre namn håller reda på alla varor som är
kända (många). Den ansvarar för att slå upp en vara baserat på dess GTIN. Det
förutsätts att varje GTIN kan mappas 1:1 med en `Product`.

`models.Inventory` håller reda på alla varor som finns i lagret just nu. För
varje instans av `Product` håller den ett lagersaldo.
