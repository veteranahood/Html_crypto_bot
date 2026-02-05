socket.emit('subscribe', { channel: 'trades' });

socket.on('trade', (data) => {
  console.log('New trade:', data);
});
