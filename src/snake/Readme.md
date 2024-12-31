---

# Snake Game

A Java-based implementation of the classic Snake game using Swing, with features such as snake movement, food and poison tiles, and scoring. This game demonstrates fundamental programming concepts like object-oriented design, event handling, and rendering in Java.

---

## Table of Contents

- [Overview](#overview)
- [How It Works](#how-it-works)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [How to Compile and Run](#how-to-compile-and-run)
- [Example Usage](#example-usage)
- [Contributing](#contributing)
- [License](#license)

---

## Overview

This project consists of the following key components:

1. **`Sound` Class**:
   - Manages background music playback during the game.

2. **`App` Class**:
   - The entry point of the application that sets up the game environment.

3. **`Snakegame` Class**:
   - Handles the game logic, including snake movement, rendering, collision detection, and scoring.

---

## How It Works

### `Sound` Class
- **Purpose**:
  - Plays background music in a continuous loop.
- **Key Method**:
  - `RunMusic(String path)`: Takes a file path to an audio file and plays it.

### `App` Class
- **Purpose**:
  - Initializes the game environment, including the game window and music.
- **Key Workflow**:
  - Creates a `JFrame` for the game window.
  - Instantiates the `Snakegame` class for rendering and game logic.
  - Calls the `RunMusic` method from the `Sound` class to start the music.

### `Snakegame` Class
- **Purpose**:
  - Contains the core gameplay mechanics and rendering logic.
- **Key Components**:
  - **Snake**:
    - Represented as a head tile and a body list.
  - **Food**:
    - Increases the snake's size when consumed.
  - **Poison**:
    - Ends the game when collided with.
  - **Controls**:
    - Handles arrow key input for snake movement.
  - **Collision Logic**:
    - Detects collisions with food, poison, walls, and the snake itself.
  - **Rendering**:
    - Draws the game elements using the `paintComponent` method.

---

## Features

1. **Gameplay**:
   - Real-time snake movement.
   - Random placement of food and poison tiles.
   - Score tracking based on the snake’s length.

2. **Graphics**:
   - Custom images for the snake, food, and poison.
   - Simple and intuitive UI.

3. **Audio**:
   - Background music to enhance user experience.

---

## Prerequisites

- Java Development Kit (JDK) 8 or higher.
- Swing library (comes with JDK).

---

## How to Compile and Run

1. **Prepare Resources**:
   - Place all necessary images and audio files in the specified resource directory (e.g., `C:\Users\Student\IdeaProjects\JAVA\0\resourcesimages`).

2. **Ensure** you have the following files:
   - `Sound.java`
   - `App.java`
   - `Snakegame.java`

3. **Compile** the Java files:
   ```bash
   javac snake/Sound.java snake/App.java snake/Snakegame.java
   ```

4. **Run** the application:
   ```bash
   java snake.App
   ```

---

## Example Usage

### Initializing the Game
Run the `App` class to start the game. The game window will open with the snake positioned at the center.

### Controlling the Snake
- Use the **arrow keys** to move the snake.

### Game Progression
- **Eat food** to grow the snake and increase the score.
- **Avoid poison tiles** and collisions to keep playing.

### Game Over
When the game ends (collision with poison, walls, or itself), the final score is displayed on the game screen.

---

## Contributing

1. Fork this repository.
2. Create a new branch (e.g., `feature/add-poison-effect`).
3. Commit your changes with descriptive messages.
4. Submit a pull request for review.

---

## License

This project is licensed under the [MIT License](LICENSE). You are free to use, modify, and distribute it.

---

Enjoy the game and have fun coding! 🎮🐍
