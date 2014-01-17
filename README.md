# Overview Entities

This project implements entities maintained by the overview builder. Each of the
centres submit a large amount of data. These are submitted as XML documents
using a data format that makes standardisation and data validation easier. When
the PhenoDCC receives these XML documents, they are stored verbatim in the
`phenodcc_raw` database. However, for the most frequent queries that are used by
the annotation generator and data display, it is faster to prepare overview
record set that are queried frequently. The `phenodcc_overview` database stores
the collection of data that are queried most frequently.

_The database schema is defined elsewhere in the overview builder_. In this
project we only define entities that are used by
[Phenoview](https://www.mousephenotype.org/phenoview) and the
[QC tool](https://www.mousephenotype.org/qc).

