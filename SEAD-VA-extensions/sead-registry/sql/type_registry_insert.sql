insert into metadata_type values('md:1',
'http://purl.org/dc/terms/','title'
);
insert into metadata_type values('md:2',
'http://purl.org/dc/terms/','creator'
);
insert into metadata_type values('md:3',
'http://purl.org/dc/terms/','identifier'
);
insert into metadata_type values('md:4',
'http://purl.org/dc/terms/','hasPart'
);
insert into metadata_type values('md:5',
'http://purl.org/dc/elements/1.1/','format'
);
insert into metadata_type values('md:6',
'http://purl.org/dc/terms/','SizeOrDuration'
);
insert into metadata_type values('md:7',
'http://purl.org/dc/terms/','issued'
);
insert into metadata_type values('md:8',
'http://purl.org/dc/terms/','mediator'
);
insert into metadata_type values('md:9',
'http://purl.org/dc/terms/','Location'
);
insert into metadata_type values('md:10',
'http://purl.org/dc/terms/','abstract'
);
insert into metadata_type values('md:11',
'http://purl.org/dc/terms/','source'
);
insert into metadata_type values('md:12',
'http://www.loc.gov/METS/','FLocat'
);
insert into metadata_type values('md:13',
'http://www.w3.org/ns/prov#','wasRevisionOf'
);
insert into relation_type values('rl:1',
'http://www.openarchives.org/ore/terms/','describes'
);
insert into base_entity values('state:1', 'PO',
'2014-01-01 00:00:00', '2014-01-01 00:00:00');

insert into state values('state:1',
'PO','PublishedObject'
);

insert into repository values(
  'repo:1',
  'IU SDA',
  'HPSS',
  'Indiana University'
);

insert into repository values(
  'repo:2',
  'IU Scholarworks',
  'dspace',
  'Indiana University'
);

insert into repository values(
  'repo:3',
  'Ideals',
  'dspace',
  'UIUC'
);

insert into data_identifier_type values(
    'id:1',
    'doi',
     'http://dx.doi.org'
);

insert into data_identifier_type values(
    'id:2',
    'ark',
     'http://n2t.net/ark'
);

insert into data_identifier_type values(
    'id:3',
    'medici',
     'http://nced.ncsa.illinois.edu'
);