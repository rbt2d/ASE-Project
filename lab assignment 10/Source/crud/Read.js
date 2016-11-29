/**
 * Created by mani on 11/1/2016.
 */
var MongoClient = require('mongodb').MongoClient;
var assert = require('assert');
var url = 'mongodb://man:qwerty12@ds011168.mlab.com:11168/mani';

var findUserwithName = function(db,callback) {
    var cursor = db.collection('mani').find({"fname":"mani"});
    cursor.each(function(err,doc) {
        assert.equal(err,null);
        if(doc != null)
        {
            console.log("First Name:" + doc.fname);
            console.log("Last Name:" + doc.lname);
            console.log("email:" + doc.email);
        }
    });}
    MongoClient.connect(url, function(err, db) {
        assert.equal(null, err);
        findUserwithName(db, function() {
            db.close();
        });
    });
