const cds = require('@sap/cds');

module.exports = (srv) => {

    srv.on('readAllSfcData', async (req) => {
        

        // Abfrage der Customsfcs
        const result = await cds.run(
            SELECT.from('customsfc')
        );

        // Rückgabe SFCs
        return result;
        
    });

};