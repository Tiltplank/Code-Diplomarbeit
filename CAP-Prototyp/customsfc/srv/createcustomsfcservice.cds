using { customsfc } from '../db/schema';

@impl: 'srv/createcustomsfc'
service CreateCustomsfcService @(path:'/createcustomsfc') { 
    
    entity Customsfcs as projection on customsfc;

    action createSfcData(sfc: String, plant: String, datafield: String, datafieldvalue: String);

}