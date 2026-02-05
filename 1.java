const socket = io('https://api.yourdomain.com');
socket.emit('subscribe', { channel: 'ticker:BTC_USDT' });

socket.on('ticker', (data) => {
  console.log('Price update:', data);
});
