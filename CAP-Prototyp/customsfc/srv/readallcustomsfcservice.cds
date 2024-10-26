using { customsfc } from '../db/schema';

@impl: 'srv/readallcustomsfc'
service ReadAllCustomsfcService @(path:'/readallcustomsfc') { 

    @readonly entity Customsfcs as projection on customsfc;

    function readAllSfcData() returns array of Customsfcs;

}