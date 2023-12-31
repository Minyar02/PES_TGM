# Introduction : 
Today, an electricity disruption, such as a blackout, can trigger a chain reaction of problems affecting banking, communication, traffic, and security, posing a significant threat, especially during the winter when homeowners can be left without heating. The implementation of a smarter grid will enhance the resilience of our electric power system, making it better equipped to handle emergencies like severe storms, earthquakes, large solar flares, and potential terrorist attacks. Thanks to its two-way interactive capabilities, the Smart Grid will enable automatic rerouting in case of equipment failures or outages, thereby reducing the duration and impact of such incidents. When a power outage does occur, Smart Grid technologies will swiftly identify and contain the outages, preventing them from escalating into widespread blackouts. Notably, one crucial component of the smart grid is the smart meter, and we have chosen to develop a prototype of this technology as part of our efforts to create solutions for smart cities.

# Architecture of the solution : 

Our concept involves the integration of a smart meter with a residence equipped with photovoltaic panels. This smart meter is designed to monitor both the power generated by the solar panels and the power consumed by the household. To achieve this, we have selected components for our smart meter, including the ESP32 microcontroller, SCT-013-030 Non-invasive Current Sensor, and ZMPT101B AC Single Phase Voltage Sensor.

In our approach, each individual house will have its dedicated smart meter. These smart meters will be connected to a central hub, which is a Raspberry Pi 4 Model B. The Raspberry Pi will perform several key functions:

1. Receive data from the ESP32 microcontrollers via a WiFi connection.
2. Pre-process the incoming data to ensure accuracy and reliability.
3. Transmit the pre-processed data to the cloud for further analysis and storage.
4. Serve as an edge node, facilitating communication between the smart meters and the cloud-based system.

Regarding the IoT platform, our plan is to utilize the Firebase IoT Cloud Platform, which will serve the following purposes:

1.Store data transmitted from the gateway.

2.Generate visual representations illustrating the data's progression through dashboards.

3.Employ the Firebase ML Kit feature to train our AI models.

4.Showcase the dashboard results and AI model predictions within the mobile app



# Features of the solution : 

Firstly, we establish a robust monitoring system that provides real-time information on voltage, current, and power consumption. Users can track the historical evolution of their energy usage and receive alerts in case of excessive consumption, thanks to predictive analytics based on historical sensor data. This prediction process is hosted in the cloud and relies on structured input data and specialized time series forecasting models.

One of the central features of our system is Anomaly Detection, which serves two crucial purposes. It identifies instances of overconsumption, empowering users to optimize their energy use, while also providing a layer of security by detecting potential malware within electrical components. We employ advanced unsupervised learning algorithms that utilize Gaussian Distribution to calculate the maximum likelihood P(X).

To make our system even more efficient and responsive, we leverage Edge Computing. This means that anomaly detection occurs locally on Edge nodes, specifically ESP 32 microcontrollers, reducing reliance on cloud resources. However, the training of anomaly detection models still takes place in the cloud.

Finally, we've designed a user-friendly mobile application that gives customers control over their energy management. Users can create accounts, monitor their consumption, and receive real-time alerts in case of anomalies or excessive usage. 

# Conclusion: 
In summary, our project is an innovative blend of energy efficiency, IoT integration, user-friendly interface, and AI-powered anomaly detection. It not only helps users save money by optimizing their energy use but also enhances the overall efficiency and security of their electrical systems.
