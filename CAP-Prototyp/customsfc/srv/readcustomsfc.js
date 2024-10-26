const cds = require('@sap/cds');

module.exports = (srv) => {

    srv.on('readSfcData', async (req) => {
        // Extrahiere die Parameter "sfc, plant" aus der Anfrage
        const { sfc, plant } = req.data;

        // Abfrage der Customsfcs
        const result = await cds.run(
            SELECT.from('customsfc').where({sfc, plant})
        );

        // Rückgabe SFCs
        return result;
        
    });

};