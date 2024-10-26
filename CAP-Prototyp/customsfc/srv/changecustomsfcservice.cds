using { customsfc } from '../db/schema';

@impl: 'srv/changecustomsfc'
service ChangeCustomsfcService @(path:'/changecustomsfc') { 

    @cds.search: { sfc, plant}
    entity Customsfcs as projection on customsfc;

    action changeSfcData(sfc: String, plant: String, datafield: String, datafieldvalue: String, datafieldnew: String, datafieldvaluenew: String);

}