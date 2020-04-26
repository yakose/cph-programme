from osmread import parse_file, Node
from collections import defaultdict


postcodes = defaultdict(lambda: defaultdict(dict))

for i, entry in enumerate(parse_file('./data/denmark-latest.osm')):
    print('i = ', i)
    if (isinstance(entry, Node) and 
        'addr:street' in entry.tags and 
        'addr:postcode' in entry.tags and 
        'addr:housenumber' in entry.tags):
        postcodes[entry.tags['addr:postcode']][entry.tags['addr:street']][entry.tags['addr:housenumber']] = entry.lon, entry.lat
