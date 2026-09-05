import { useState } from 'react'
import heroImg from './assets/hero.png'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div className="container mx-auto p-4">
        <h1 className="text-2xl font-bold mb-4">
          SentimentAI – Intelligent Feedback Sentiment Analyzer
        </h1>
        <form className="mb-4">
          <textarea className="w-full p-2 border rounded mb-2" placeholder='Enter your Feedback...' rows="4"></textarea>
          <button type='submit' className='px-4 py-2 rounded bg-blue-600 text-white'>Submit Feedback</button>
        </form>

      </div>
    </>
  )
}

export default App
