# Testausdokumentaatio

Testaus suoritettiin JUnit-yksikkötesteillä sekä käyttöliittymän läpikäymisenä metodi kerrallaan. Yksikkötestit testasivat ohjelman logiikkaa ja käyttötestaus sen käyttöliittymää ja luokkien ja niiden metodien yhdessä toimimista ja käyttöä.

Yksikkötesteissä ei ilmennyt merkittäviä ongelmia: aiheiden lisäys sekä poisto toimivat hyvin. Käyttötestauksen yhteydessä havaittiin kaksi merkittävämpää bugia. Ensimmäisenä havaittiin käyttöliittymän alustusongelma käyttöliittymän luokassa. NullPointerExceptioneita tuli useita. Luokan instanssi ei alustunut oikein, vaan jäi null-arvoon. ArrayList-listojen alustuksessa puuttui listattavan luokan parametri. Oikea alustus oli new ArrayList<Aihe>();.

Tiedostonlukijassa ongelmana oli tyhjien aiheiden lukeminen. Ongelma liittyyi siihen, ettei ohjelma osannut heittää file not found -poikkeusta tyhjän tiedoston kohdalla.
