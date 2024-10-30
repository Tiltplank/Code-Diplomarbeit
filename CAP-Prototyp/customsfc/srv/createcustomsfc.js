const cds = require('@sap/cds');

module.exports = (srv) => {
    srv.on('createSfcData', async (req) => {

        const {sfc, plant, datafield, datafieldvalue} = req.data;
        // Prüfen ob Für diesen Datensatz schon ein Eintrag existiert
        const resultsearch = await cds.run(
            SELECT.from('customsfc').where({sfc,plant,datafield,datafieldvalue})
        )

        if (resultsearch[0] === undefined){
            await cds.run(
                INSERT.into('customsfc').entries({...req.data})
                );

        }
    });

};