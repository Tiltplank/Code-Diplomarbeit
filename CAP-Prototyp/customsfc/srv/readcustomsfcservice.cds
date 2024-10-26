using { customsfc } from '../db/schema';

@impl: 'srv/readcustomsfc'
service ReadCustomsfcService @(path:'/readcustomsfc') { 


    @readonly entity Customsfcs as projection on customsfc;

    function readSfcData(sfc: String, plant: String) returns array of Customsfcs;

}