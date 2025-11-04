# Event Ticketing Platform
![ticketing system](ticketing_system.png)

## Summary
A web-based platform enabling users to create events, manage ticket sales, and generate QR-coded tickets for attendees, streamlining the event management and ticket distribution process.

## Definitions

### Event
A planned gathering or occasion with a specific date, time, and venue that requires ticketing for attendance management.

### Ticket
A digital or physical document that grants the holder access to an event, containing event details and a unique QR code for validation.

### QR Code
A machine-readable code consisting of black and white squares, used to store ticket information and verify authenticity at event entry.

## User Stories

### Create Event
As an event organizer  
I want to create and configure a new event with details like date, venue, and ticket types  
So that I can start selling tickets to attendees

#### Acceptance Criteria
1. Organizer can input event name, date, time, and venue
2. Organizer can set multiple ticket types with different prices
3. Organizer can specify total available tickets per type
4. Event appears on the platform after creation
5. Organizer receives confirmation email with event details

### Manage Ticket Sales
As an event organizer  
I want to monitor and manage ticket sales  
So that I can track revenue and attendance

#### Acceptance Criteria
1. Dashboard displays real-time sales metrics
2. Organizer can view purchaser details
3. Organizer can export sales reports
4. System prevents overselling of tickets
5. Sales automatically stop at specified end date

### Validate Tickets
As an event staff member  
I want to scan attendee QR codes at entry  
So that I can verify ticket authenticity

#### Acceptance Criteria
1. Staff can scan QR codes using mobile device
2. System displays ticket validity status instantly
3. System prevents duplicate ticket use
4. Staff can manually input ticket numbers if QR scan fails

## Bonus Features
* Event analytics dashboard for attendee demographics and sales trends
* Automated email marketing system for event promotion and attendee communication

## Class Diagram
![Event Ticket Platform classDiagram](EventTicketPlatform-classDiagram.png)

## Front-end and backend connection
![Frontend Backend](EventTicketPlatform-frontend_backend.png)
