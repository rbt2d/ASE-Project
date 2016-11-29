/**
 * Created by mani on 11/1/2016.
 */
var MongoClient = require('mongodb').MongoClient;
var assert = require('assert');
var url = 'mongodb://man:qwerty12@ds011168.mlab.com:11168/mani';

var deleteUserwithName = function(db,callback) {
    db.collection('mani').remove( {

            "fname":"ravi"

        },

        function(err, result) {
            assert.equal(err, null);
            console.log("deleted a document into the roo collection.");
            callback();
        });
};
MongoClient.connect(url, function(err, db) {
    assert.equal(null, err);
    deleteUserwithName(db, function() {
        db.close();
    });
});
/**
 * Created by rAj on 11/1/2016.
 */
