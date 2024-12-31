---

# Flappy Bird

A Java-based graphical implementation of the popular game Flappy Bird. The game uses Swing for rendering graphics and handling user interactions, providing an engaging gameplay experience with real-time bird movement, pipe obstacles, and scoring.

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

This project consists of two main components:

1. **`FlappyBird` Class**:
   - Implements the core gameplay mechanics, rendering, and event handling.

2. **`App` Class**:
   - The entry point of the application that initializes the game window and adds the `FlappyBird` panel.

---

## How It Works

### `FlappyBird` Class

#### Gameplay:
- **Bird**:
  - A small rectangle representing the bird that moves vertically based on gravity and user input.
  - The bird "jumps" when the spacebar is pressed.

- **Pipes**:
  - Randomly generated top and bottom pipes serve as obstacles.
  - Pipes move horizontally across the screen.

#### Game Logic:
- **Gravity**:
  - Simulated with a vertical velocity that increases over time.
- **Collision Detection**:
  - Checks if the bird collides with a pipe or goes off-screen.
- **Score Tracking**:
  - Increases when the bird successfully passes through a pair of pipes.

#### Graphics:
- Uses images for the bird, pipes, and background.
- Real-time rendering with the `paintComponent` method.

---

### `App` Class

#### Game Window:
- Creates a JFrame as the game window.
- Adds the `FlappyBird` panel to the frame and starts the game.

---

## Features

1. **Gameplay**:
   - Simple and addictive gameplay inspired by the classic Flappy Bird.

2. **Graphics**:
   - Custom images for the bird, pipes, and background.

3. **Score Tracking**:
   - Displays the current score in real time.

4. **Game Over**:
   - Stops the game and displays the final score when the bird collides with a pipe or the ground.

---

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher.
- Swing library (comes with JDK).
- Required images in the `images` directory:
  - `flappybirdbg.png` (background)
  - `flappybird.png` (bird)
  - `toppipe.png` (top pipe)
  - `bottompipe.png` (bottom pipe)

---

## How to Compile and Run

1. **Prepare Resources**:
   - Ensure the required image files are placed in the `images` directory.

2. **Compile** the Java files:
   ```bash
   javac bird/FlappyBird.java bird/App.java
   ```

3. **Run** the application:
   ```bash
   java bird.App
   ```

---

## Example Usage

### Starting the Game
1. Run the `App` class to start the game.
2. Press the **spacebar** to make the bird jump.

### Gameplay
- Guide the bird through gaps between the pipes.
- Avoid collisions with pipes or the ground to keep playing.

### Game Over
- The game ends if the bird collides with an obstacle.
- The final score is displayed on the screen.

---

## Contributing

1. **Fork** this repository.
2. **Create** a new branch (e.g., `feature/add-power-ups`).
3. **Commit** your changes.
4. **Submit** a pull request for review.

---

## License

This project is licensed under the [MIT License](LICENSE). You are free to use, modify, and distribute it.

---

Enjoy the game and happy coding! 🎮🐦
