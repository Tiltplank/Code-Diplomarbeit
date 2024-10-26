const cds = require('@sap/cds');

module.exports = (srv) => {
    srv.on('createSfcData', async (req) => {
        // Stellen der Anfrage
        await cds.run(
            INSERT.into('customsfc').entries({...req.data})
            );
    });

};