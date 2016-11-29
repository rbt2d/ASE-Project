/**
 * Created by mani on 11/1/2016.
 */
var MongoClient = require('mongodb').MongoClient;
var assert = require('assert');
var url = 'mongodb://man:qwerty12@ds011168.mlab.com:11168/mani';

var updateUserwithName = function(db,callback) {
    db.collection('mani').update( {

        "fname":"mani"
         // "_id": {"58194c35c9b561280453cc9c"}
}, {
            $set: { "fname": "maninandan", type: 0,  },
            $currentDate: { lastModified: true }
        },

        function(err, result) {
        assert.equal(err, null);
        console.log("updated a document into the mani collection.");
        callback();
    });
};
MongoClient.connect(url, function(err, db) {
    assert.equal(null, err);
    updateUserwithName(db, function() {
        db.close();
    });
});
