fetch('https://fakestoreapi.com/products')
.then(response => response.json())
.then(data => {
    const category='electronics';
    const filteredProducts = data.filter(product => product.category.toLowerCase() === category.toLowerCase());
    console.log(`Category: ${category}`);
    filteredProducts.forEach(product => {
        console.log(`- ${product.title}`);
    });
})
.catch(error => console.error('Error fetching data:', error));