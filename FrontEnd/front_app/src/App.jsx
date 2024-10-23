import { useState } from 'react';
import './App.css';
import NavigationBar from './Components/NavigationBar';
import { Container, Row, Col, Card } from 'react-bootstrap';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'; // Importez Routes et Route
import Footer from './Components/Footer';
import VoitureListe from './Components/VoitureListe';
import Voiture from './Components/Voiture';

function App() {
  const [count, setCount] = useState(0);

  return (
    <>
      <Router>
        <NavigationBar />

        <div>
          <h1>Bienvenue au Magasin des Voitures</h1>
        </div>
         <Routes>
        <Route path="/list" element={<VoitureListe />} /> {/* Liste des voitures */}
        <Route path="/add" element={<Voiture />} /> {/* Ajouter une nouvelle voiture */}
      </Routes>
        <Container>
          <Row>
            <Col>
              <Card className="mt-4">
                <Card.Body>
                  <Card.Title>Hello World!</Card.Title>
                  <Card.Text>
                    Ceci est le corps de la page.
                  </Card.Text>
                </Card.Body>
              </Card>
            </Col>
          </Row>
        </Container>
        <div className="card">
          <button onClick={() => setCount((count) => count + 1)}>
            count is {count}
          </button>
        </div>
      </Router>
      <Footer/>
    </>
  );
}

export default App;
