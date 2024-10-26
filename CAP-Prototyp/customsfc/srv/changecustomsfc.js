const cds = require('@sap/cds');

module.exports = (srv) => {

    srv.on('changeSfcData', async (req) => {
        // Extrahiere Parameter aus der Anfrage
        const {sfc, plant, datafield, datafieldvalue, datafieldnew, datafieldvaluenew } = req.data;

        // Abrufen des Datensatzes
        const resultsearch = await cds.run(
            SELECT.from('customsfc').where({sfc,plant,datafield,datafieldvalue})
        );

        // Aktualisieren der Daten
        const result = await cds.run(
            UPDATE('customsfc')
                .set({datafield: datafieldnew, datafieldvalue: datafieldvaluenew})
                .where({ID: resultsearch[0].ID})
        );
    
    });

};