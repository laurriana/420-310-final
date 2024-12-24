drop table if exists album;
CREATE TABLE album
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    album_name  VARCHAR(255),
    artist_name VARCHAR(255),
    playcount   INT,
    album_url   VARCHAR(255)
);

INSERT INTO album (album_name, artist_name, playcount, album_url)
VALUES ('NCT #127 CHERRY BOMB - The 3rd Mini Album', 'NCT 127', 522,
        'https://www.last.fm/music/NCT+127/NCT+%23127+CHERRY+BOMB+-+The+3rd+Mini+Album'),
       ('WALK - The 6th Album', 'NCT 127', 341, 'https://www.last.fm/music/NCT+127/WALK+-+The+6th+Album'),
       ('J - The 1st Album', 'Jaehyun', 306, 'https://www.last.fm/music/Jaehyun/J+-+The+1st+Album'),
       ('Fact Check - The 5th Album', 'NCT 127', 291, 'https://www.last.fm/music/NCT+127/Fact+Check+-+The+5th+Album'),
       ('On My Youth - The 2nd Album', 'WayV', 285, 'https://www.last.fm/music/WayV/On+My+Youth+-+The+2nd+Album'),
       ('Did It First (with Central Cee)', 'Ice Spice', 283,
        'https://www.last.fm/music/Ice+Spice/Did+It+First+(with+Central+Cee)'),
       ('Perfume - The 1st Mini Album', 'NCT DOJAEJUNG', 270,
        'https://www.last.fm/music/NCT+DOJAEJUNG/Perfume+-+The+1st+Mini+Album'),
       ('2 Baddies - The 4th Album', 'NCT 127', 263, 'https://www.last.fm/music/NCT+127/2+Baddies+-+The+4th+Album'),
       ('NCT #127 Neo Zone - The 2nd Album', 'NCT 127', 235,
        'https://www.last.fm/music/NCT+127/NCT+%23127+Neo+Zone+-+The+2nd+Album'),
       ('NCT #127 Regular-Irregular - The 1st Album', 'NCT 127', 185,
        'https://www.last.fm/music/NCT+127/NCT+%23127+Regular-Irregular+-+The+1st+Album'),
       ('Favorite - The 3rd Album Repackage', 'NCT 127', 182,
        'https://www.last.fm/music/NCT+127/Favorite+-+The+3rd+Album+Repackage'),
       ('NCT #127 WE ARE SUPERHUMAN - The 4th Mini Album', 'NCT 127', 182,
        'https://www.last.fm/music/NCT+127/NCT+%23127+WE+ARE+SUPERHUMAN+-+The+4th+Mini+Album'),
       ('Perfect Velvet - The 2nd Album', 'Red Velvet', 170,
        'https://www.last.fm/music/Red+Velvet/Perfect+Velvet+-+The+2nd+Album'),
       ('Wicked: The Soundtrack', 'Wicked Movie Cast', 170,
        'https://www.last.fm/music/Wicked+Movie+Cast/Wicked:+The+Soundtrack'),
       ('Like..? (Deluxe)', 'Ice Spice', 167, 'https://www.last.fm/music/Ice+Spice/Like..%3F+(Deluxe)');

-- loved tracks
drop table if exists loved_tracks;
CREATE TABLE loved_tracks
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    artist_name VARCHAR(255),
    track_date  DATE,
    track_url   TEXT,
    track_name  VARCHAR(255)
);

INSERT INTO loved_tracks (artist_name, track_date, track_url, track_name)
VALUES ('Sunny', '2024-12-06', 'https://www.last.fm/music/Sunny/_/Goodbye', 'Goodbye'),
       ('Cynthia Erivo', '2024-11-29', 'https://www.last.fm/music/Cynthia+Erivo/_/I%E2%80%99m+Not+That+Girl',
        'I’m Not That Girl'),
       ('Ariana Grande', '2024-11-24', 'https://www.last.fm/music/Ariana+Grande/_/What+Is+This+Feeling%3F',
        'What Is This Feeling?'),
       ('FLO', '2024-11-17', 'https://www.last.fm/music/FLO/_/Get+It+Till+I%E2%80%99m+Gone', 'Get It Till I’m Gone'),
       ('EXO', '2024-11-04', 'https://www.last.fm/music/EXO/_/Trauma', 'Trauma'),
       ('EXO', '2024-11-03', 'https://www.last.fm/music/EXO/_/Damage', 'Damage'),
       ('Jaehyun', '2024-10-22', 'https://www.last.fm/music/Jaehyun/_/LOST', 'LOST'),
       ('NCT 127', '2024-10-21', 'https://www.last.fm/music/NCT+127/_/Superhuman', 'Superhuman'),
       ('RIIZE', '2024-10-14', 'https://www.last.fm/music/RIIZE/_/Impossible', 'Impossible'),
       ('WayV', '2024-10-07', 'https://www.last.fm/music/WayV/_/Lighthouse', 'Lighthouse'),
       ('Kai', '2024-09-30', 'https://www.last.fm/music/Kai/_/Hello+Stranger', 'Hello Stranger'),
       ('WayV', '2024-09-25', 'https://www.last.fm/music/WayV/_/Poppin%27+Love', 'Poppin Love'),
       ('Jaehyun', '2024-09-20', 'https://www.last.fm/music/Jaehyun/_/Roses', 'Roses'),
       ('NCT 127', '2024-09-10', 'https://www.last.fm/music/NCT+127/_/0+Mile', '0 Mile'),
       ('Jaehyun', '2024-08-30', 'https://www.last.fm/music/Jaehyun/_/Flamin%27+Hot+Lemon', 'Flamin Hot Lemon');
