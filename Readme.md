# 🤖 Crypto.com AI Trading Bot

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Node.js](https://img.shields.io/badge/Node.js-18+-green.svg)](https://nodejs.org/)
[![Docker](https://img.shields.io/badge/Docker-Ready-blue.svg)](https://www.docker.com/)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](CONTRIBUTING.md)

An advanced AI-powered trading bot specifically designed for Crypto.com exchange, featuring a 16-personality MBTI-based AI system for intelligent trading decisions.

## ✨ Features

### 🤖 AI-Powered Trading
- **16 MBTI Personality System**: Each AI personality brings unique trading strategies
- **Hybrid AI Architecture**: Local (Ollama) + Cloud AI integration
- **Consensus Decision Making**: All 16 personalities vote on trading decisions
- **Continuous Learning**: Adapts to market conditions

### ⚡ Crypto.com Integration
- **Direct API Connection**: Real-time market data and trading
- **Auto Buy/Sell**: Configurable thresholds (-50% to +100%)
- **Portfolio Management**: Automatic rebalancing
- **Withdrawal Automation**: Profits auto-sent to your BTC wallet

### 🔒 Security Features
- **Military-Grade Encryption**: AES-256 encryption for all sensitive data
- **Permission-Based Access**: Granular control over bot actions
- **Background Operation**: Runs 24/7 with phone locked
- **No Cloud Storage**: Your keys stay on your device

### 📊 Advanced Trading
- **Customizable Strategies**: Set your own buy/sell thresholds
- **Risk Management**: Conservative to aggressive profiles (0-10)
- **Speed Control**: Adjust trading frequency (1-100 trades/hour)
- **Cycle-Based Trading**: Set trading durations (24h to 90 days)

## 🚀 Quick Start

### Prerequisites
- Node.js 18+ or Docker
- Crypto.com account with API access
- MongoDB and Redis (optional, Docker included)

### Installation

```bash
# Clone the repository
git clone https://github.com/YOUR-USERNAME/crypto-trading-bot.git
cd crypto-trading-bot

# Method 1: Using Docker (Recommended)
docker-compose up -d

# Method 2: Manual installation
npm run setup
npm start

# Access the bot
Open http://localhost:3000 in your browser
